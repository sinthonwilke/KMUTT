#include <iostream>
using namespace std;

class ScoreBoard
{
    private:
        string name;
        float score;
        ScoreBoard *next;
        ScoreBoard *prev;
    public:
        ScoreBoard(ScoreBoard *next = NULL, ScoreBoard *prev = NULL)
        {
            this->next = next;
            this->prev = prev;
        }

        ScoreBoard(string name, float score, ScoreBoard *next = NULL, ScoreBoard *prev = NULL)
        {
            this->name = name;
            this->score = score;
            this->next = next;
            this->prev = prev;
        }

        string getName() {return this->name;}
        float getScore() {return this->score;}
        void setNext(ScoreBoard *next) { this->next = next; }
        ScoreBoard *getNext() {return this->next;}
        void setPrev(ScoreBoard *prev) {this->prev = prev;}
        ScoreBoard *getPrev() {return this->prev;}
};

class HeadScoreBoard
{
    private:
        int max;
        int num;
        ScoreBoard *head;
        ScoreBoard *tail;
        ScoreBoard *fence;

    public:
        HeadScoreBoard() {setStart();}
        ~HeadScoreBoard() {destroy();}
        void setStart()
        {
        head = tail = fence = new ScoreBoard;
        this->max = 10;
        this->num = 0;
        }

        void insert(ScoreBoard *temp)
        {
            if (fence->getNext() != NULL)
            {
                fence->getNext()->setPrev(temp);
            }
            temp->setNext(fence->getNext());
            temp->setPrev(fence);
            fence->setNext(temp);
            this->num++;
        }

        void remove()
        {
        ScoreBoard *temp;
        temp = fence->getNext();
        temp->getNext()->setPrev(fence);
        fence->setNext(temp->getNext());
        delete temp;
        }

        void destroy()
        {
            while (head != NULL)
            {
                fence = head;
                head = head->getNext();
                delete fence;
            }
        }

        void fenceToNext()
        {
            if (fence->getNext() != NULL)
            {
                fence = fence->getNext();
            }
        }

        void fenceToPrev()
        {
            if (fence->getPrev() != NULL)
            {
                fence = fence->getPrev();
            }
        }

        void addNewScore(string name, float score)
        {
            ScoreBoard *temp = new ScoreBoard(name, score);
            fence = head;
            while (true)
            {
                if (fence == tail)
                {
                    insert(temp);
                    tail = temp;
                    break;
                }
                else
                {
                    if (score > fence->getNext()->getScore())
                    {
                        insert(temp);
                        break;
                    }
                    else
                    {
                        fenceToNext();
                    }
                }
            }
        }

        void printTopScore()
        {
            string removeMsg;
            while (num > 10)
            {
                fence = tail->getPrev();
                removeMsg = tail->getName() + " was remove from the score board.";
                delete tail;
                tail = fence;
                tail->setNext(NULL);
                num--;
            }
            fence = head;
            while (fence != tail)
            {
                cout << fence->getNext()->getName() << " "<< fence->getNext()->getScore() << endl;
                fenceToNext();
            }
            cout << removeMsg << endl;
        }
};


int main()
{
    HeadScoreBoard GameScoreBoard;
    GameScoreBoard.addNewScore("Teddy",     86);
    GameScoreBoard.addNewScore("Randy",     24);
    GameScoreBoard.addNewScore("Jordy",     19);
    GameScoreBoard.addNewScore("Hardy",     24);
    GameScoreBoard.addNewScore("Georgie",   75);
    GameScoreBoard.addNewScore("Fredy",     53);
    GameScoreBoard.addNewScore("Eddie",     67);
    GameScoreBoard.addNewScore("Dabby",     80);
    GameScoreBoard.addNewScore("Cody",      32);
    GameScoreBoard.addNewScore("Bobby",     47);
    GameScoreBoard.addNewScore("Abby",      67);
    GameScoreBoard.printTopScore();
    return 0;
}