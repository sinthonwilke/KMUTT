#include <iostream>
#include <cstring>
#include <cmath>
using namespace std;

void MaxStudent();
void MinStudent();
float AvgScore();
void ModeScore();
void MedianScore();
float SDScore();
void printGrade();

struct Students
{
    char name[50];
    int score;
};

const int len = 10;
struct Students students[len];

/*---------------------------------------------main---------------------------------------------*/
int main()
{
    students[0] = {"Adam",      71};
    students[1] = {"Baaron",    65};
    students[2] = {"Calbert",   91};
    students[3] = {"Dailen",    85};
    students[4] = {"Edison",    59};
    students[5] = {"Falcon",    70};
    students[6] = {"Gaberial",  76};
    students[7] = {"Hailey",    65};
    students[8] = {"Igor",      88};
    students[9] = {"Jackob",    81};

    MaxStudent();
    MinStudent();
    cout << "The average score is: " << AvgScore() << endl;
    ModeScore();
    MedianScore();
    cout << "The standard deviation is: " << SDScore() << endl;
    printGrade();

    return 0;
}
/*----------------------------------------------------------------------------------------------*/
void MaxStudent()
{
    int index, max = 0;
    for(int i = 0; i < len; i++)
    {
        if (students[i].score > max)
        {
            max = students[i].score;
            index = i;
        }
    }
    cout << "\"" << students[index].name << "\"" << " has the highest score: " << students[index].score << endl;
}

void MinStudent()
{
    int index, min = INT_MAX;
    for(int i = 0; i < len; i++)
    {
        if (students[i].score < min)
        {
            min = students[i].score;
            index = i;
        }
    }
    cout << "\"" << students[index].name << "\"" << " has the lowest score: " << students[index].score << endl;
}

float AvgScore()
{
    float avg = 0;
    for(int i = 0; i < len; i++)
    {
        avg += students[i].score;
    }
    avg /= len;
    return avg;
}

void ModeScore()
{
    int mode, modeCount = 1, modeMax = 0, index;

    for(int i = 0; i < len; i++)
    {
        mode = students[i].score;
        modeCount = 1;

        for(int j = i+1; j < len; j++)
        {
            if (mode == students[j].score)
            {
                modeCount += 1;
            }
        }
        if(modeCount > modeMax)
        {
            modeMax = modeCount;
            index = i;
        }

    }
    if (modeMax == 1)
    {
        cout << "There is no mode number, all number is unique." << endl;
    }
    else
    {
        cout << "The mode number is: " << students[index].score << " occurs: " << modeMax << " times." << endl;
    }
}

void MedianScore()
{
    int tempScore;
    string tempName, name;

    for (int i = 0; i < len; i++)
    {
        for (int j = i+1; j < len; j++)
        {
            if (students[i].score > students[j].score)
            {
                tempScore = students[i].score;
                tempName = students[i].name;
                students[i].score = students[j].score;
                name = students[j].name;
                strcpy(students[i].name, name.c_str());
                students[j].score = tempScore;
                strcpy(students[j].name, tempName.c_str());
            }
        }
    }

    int index;
    float studentScoreOut;
    if (len % 2 != 0)
    {
        index = len / 2;
        cout << "The median is: " << students[index].score << endl;
    }
    else
    {
        index = len / 2;
        cout << "The median is: " << (students[index - 1].score + students[index].score) / float(2) << endl;
    }
}

float SDScore()
{
    float sd = 0, sum = 0, mean = AvgScore();

    for (int i = 0; i < len; i++){sum += pow((students[i].score - mean), 2);}
    sd = sqrt(sum / float(len));
    return sd;
}

void printGrade()
{
    float gradeA = AvgScore() + 2 * SDScore();
    float gradeB = AvgScore() + SDScore();
    float gradeC = AvgScore();
    float gradeD = AvgScore() - SDScore();

    for (int i = 0; i < len; i++)
    {  
        if (students[i].score > gradeA) {cout << "\"" << students[i].name << "\"" << " got grade: A" << endl;}
        else if (students[i].score < gradeA && students[i].score > gradeB) {cout << "\"" << students[i].name << "\"" << " got grade: B" << endl;}
        else if (students[i].score < gradeB && students[i].score > gradeC) {cout << "\"" << students[i].name << "\"" << " got grade: C" << endl;}
        else if (students[i].score < gradeC && students[i].score > gradeD) {cout << "\"" << students[i].name << "\"" << " got grade: D" << endl;}
        else if (students[i].score < gradeD) {cout << "\"" << students[i].name << "\"" << " got grade: F" << endl;}
    }
}