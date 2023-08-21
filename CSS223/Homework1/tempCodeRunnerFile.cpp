#include <iostream>
#include <fstream>
#include <sstream>
#include <cmath>
#include <string>
using namespace std;

struct MBTI
{
    string StudentID;
    string name;
    float Ne;
    float Ni;
    float Te;
    float Ti;
    float Se;
    float Si;
    float Fe;
    float Fi;
    string type;
    float distance;
    void display()
    {
        cout << this->StudentID << ", " << this->name << ", " << this->Ne << ", " << this->Ni
        << ", " << this->Te << ", " << this->Ti << ", " << this->Se << ", " << this->Si << ", " << this->Fe << ", " << this->Fi << ", "
        << this->type << ", " << this->distance << endl;
    }
};

const int BMTI_table_count = 53;
struct MBTI BMTI_table[BMTI_table_count];
struct MBTI my_BMTI;

void inputData()
{
    BMTI_table[0] =     {"64090500401","Chanunya Srathongtha",          28.2,22,20,30,27,27,27,20,  "ENFJ"};
    BMTI_table[1] =     {"64090500402","Nattapon Pongkao",              26.4,24,30,28,32,31,24,26,  "ISTP"};
    BMTI_table[2] =     {"64090500403","Thanachote Wattanakhantijarone",24.4,14,30,26,31,31,24,17,  "ESTP"};
    BMTI_table[3] =     {"64090500404","Thanyapisit Buaprakhong",       41,26.4,44,38,43,36,34,32,  "ENTJ"};
    BMTI_table[4] =     {"64090500405","Punnapa Thianchai",             24.2,21.4,27,28,31,30,33,25,"ISFJ"};
    BMTI_table[5] =     {"64090500406","Pakawat Kulchot",               28,23.8,34,34,36,37,36,30,  "ESTP"};
    BMTI_table[6] =     {"64090500407","Varintorn SIthisint",           22.4,22,31,29,34,38,35,19,  "ESTP"};
    BMTI_table[7] =     {"64090500408","Sirawit Pongsawet",             26,17.6,23,29,21,21,25,17,  "ESFP"};
    BMTI_table[8] =     {"64090500409","Awirut Pusansa-ad",             31,29.8,38,19,27,31,30,32,  "ESFP"};
    BMTI_table[9] =     {"64090500410","Kantapon Hiranchatchawal",      19.8,19,34,25,21,29,26,22,  "ESTP"};
    BMTI_table[10] =    {"64090500411","Kittpot Onnomdee",              40.2,30,31,30,32,36,37,40,  "ENFP"};
    BMTI_table[11] =    {"64090500412","Jaruwit Singsom",               41.6,36.6,25,18,27,32,32,40,"INTP"};
    BMTI_table[12] =    {"64090500413","Chananan sudjairak",            26,25,24,36,33,33,26,21,    "ESTJ"};
    BMTI_table[13] =    {"64090500414","Yanisa Limjantra",              27,19,26,20,28,33,24,15,    "ENFP"};
    BMTI_table[14] =    {"64090500415","Thalit Chaimunin",              29.2,18.6,31,36,27,30,25,22,"ESTJ"};
    BMTI_table[15] =    {"64090500416","Thatsamaphon Boonchuntuk",      26.2,26.6,30,33,32,37,32,29,"ISTJ"};
    BMTI_table[16] =    {"64090500417","Panachai Likhitpanyarat",       35,32,30,34,28,30,27,24,    "INTP"};
    BMTI_table[17] =    {"64090500418","Pawaris Chaideesripraphan",     22.8,24,28,32,22,33,25,17,  "ISFJ"};
    BMTI_table[18] =    {"64090500419","Pimpatcha Singh",               24.8,24.6,26,32,33,34,28,16,"ESTJ"};
    BMTI_table[19] =    {"64090500420","Walaiporn Khumplub",            22.6,25,34,25,24,28,26,25,  "ESTJ"};
    BMTI_table[20] =    {"64090500421","Watcharapol Treesatthayasakul", 26.4,24.6,24,30,30,24,23,25,"ESTJ"};
    BMTI_table[21] =    {"64090500422","Apiwich Visarnlerdsiri",        20.4,21,26,29,23,22,20,15,  "ENFP"};
    BMTI_table[22] =    {"64090500423","Kanok Vongsaroj",               37.4,31.4,27,38,22,30,43,28,"ESFJ"};
    BMTI_table[23] =    {"64090500424","Kanokwan Rungruengchokchai",    37,19.8,35,23,31,29,35,27,  "ESFP"};
    BMTI_table[24] =    {"64090500425","Kollawat Ruanghirun",           28.4,31.2,18,25,21,24,22,18,"INFP"};
    BMTI_table[25] =    {"64090500426","Jittapat Chanyarungroj",        39.4,34,26,24,30,37,30,32,  "INTP"};
    BMTI_table[26] =    {"64090500427","Jirapat Jirayanamit",           27.8,19.6,29,32,29,28,27,19,"ESFJ"};
    BMTI_table[27] =    {"64090500429","Chutphon Kanokpannachot",       30.4,35.4,34,26,26,35,33,22,"ISTP"};
    BMTI_table[28] =    {"64090500430","Noppawut Iamwongsri",           29,21.6,27,19,26,28,23,25,  "ENTP"};
    BMTI_table[29] =    {"64090500431","Nutthanon Thongcharoen",        28.2,17.6,35,39,26,37,28,20,"ESTJ"};
    BMTI_table[30] =    {"64090500432","Tuangsub Rattanathai",          25,25,21,27,21,27,23,24,    "ISFJ"};
    BMTI_table[31] =    {"64090500433","Thana Prajonkla",               24,25.8,42,35,38,35,33,36,  "ESTJ"};
    BMTI_table[32] =    {"64090500434","Teerapong Pongdarnpet",         26.6,26,24,28,31,36,27,27,  "INTP"};
    BMTI_table[33] =    {"64090500436","Nanthawat Sukkam",              24.8,21.8,27,35,28,36,27,22,"ISFJ"};
    BMTI_table[34] =    {"64090500437","Nitiphat Unrrom",               36.4,38.2,32,31,23,27,25,32,"INTP"};
    BMTI_table[35] =    {"64090500439","Puntana Saengchot",             22.8,23.6,25,27,28,28,24,25,"ISFJ"};
    BMTI_table[36] =    {"64090500440","Parichart Sae-yhooong",         41.2,30.8,31,41,32,33,43,25,"ESFJ"};
    BMTI_table[37] =    {"64090500441","Pongpayom Monplub",             35,27.8,27,40,39,38,41,33,  "ISTJ"};
    BMTI_table[38] =    {"64090500442","Ponragrit Pasurakarn",          31,28.6,29,33,31,29,26,25,  "ESTP"};
    BMTI_table[39] =    {"64090500444","Rawisada Anuruttikun",          21,25.4,25,30,30,32,27,22,  "ISFJ"};
    BMTI_table[40] =    {"64090500445","Waritnan Panpimyai",            29.6,30,20,29,24,30,28,20,  "INTP"};
    BMTI_table[41] =    {"64090500446","Warisara Kanyaprasit",          25.8,36,27,34,22,28,28,9,   "INFJ"};
    BMTI_table[42] =    {"64090500447","Watchara Buasrirattana",        21,26.6,26,26,19,30,21,24,  "ISTP"};
    BMTI_table[43] =    {"64090500449","Vitchakorn Charoenying",        35.4,28,38,29,25,30,36,27,  "INFP"};
    BMTI_table[44] =    {"64090500451","Siraphat Ninprasert",           23.8,26,34,28,28,21,22,17,  "ISTP"};
    BMTI_table[45] =    {"64090500452","Onicha Nitilappool",            22.6,12.6,29,32,24,41,23,15,"ISTJ"};
    BMTI_table[46] =    {"64090500453","Alisa Wongcharoensatit",        30.4,21.4,30,31,20,27,19,10,"INTP"};
    BMTI_table[47] =    {"64090500454","Panicha Kunanuntapong",         40,32.2,20,32,22,44,16,27,  "INTP"};
    BMTI_table[48] =    {"63090500248","Sutida  Chankaew",              18.6,30.2,31,27,27,25,19,19,"ENTP"};
    BMTI_table[49] =    {"63090500219","Thanphitcha  Khuenyotha",       34.2,27,32,41,29,32,32,26,  "ENTJ"};
    BMTI_table[50] =    {"63090500234","Natchanon Sareetee",            27.6,23,30,33,35,34,38,32,  "ISTJ"};
    BMTI_table[51] =    {"63090500202","Kuntida Meekam",                32.8,34.4,34,35,29,27,34,30,"INFJ"};
    BMTI_table[52] =    {"63090500010","Thanakrit Sawaengphol",         33,35.6,25,30,36,40,32,28,  "INTP"};

    my_BMTI =           {"64090500450","Sinthon Wilke",                 26.4,26.4,33,39,21,30,23,26,"INTP"};
}

int* calculateDistance()
{
    float Min1, Min2, Min3; Min1 = Min2 = Min3 = INT_MAX;
    static int ans[2];

    for(int i = 0; i < BMTI_table_count; i++)
    {
        float temp = 0;
        float distance = 0;
        temp = pow(BMTI_table[i].Ne - my_BMTI.Ne, 2)
                + pow(BMTI_table[i].Ni - my_BMTI.Ni, 2)
                + pow(BMTI_table[i].Te - my_BMTI.Te, 2)
                + pow(BMTI_table[i].Ti - my_BMTI.Ti, 2)
                + pow(BMTI_table[i].Se - my_BMTI.Se, 2)
                + pow(BMTI_table[i].Si - my_BMTI.Si, 2)
                + pow(BMTI_table[i].Fe - my_BMTI.Fe, 2)
                + pow(BMTI_table[i].Fi - my_BMTI.Fi, 2);
        distance = sqrt(temp);
        BMTI_table[i].distance = distance;

        if (distance < Min1)
        {
            Min1 = distance;
            ans[0] = i;
        }
        else if (distance > Min1 && distance < Min2)
        {
            Min2 = distance;
            ans[1] = i;

        }
        else if (distance > Min2 && distance < Min3)
        {
            Min3 = distance;
            ans[2] = i;
        }
    }
    return ans;
}

void findType(int *p)
{
    string type1, type2, type3;
    string myType = "";
    type1 = BMTI_table[p[0]].type;
    type2 = BMTI_table[p[1]].type;
    type3 = BMTI_table[p[2]].type;
    
    for(int i = 0; i < 4; i++)
    {
        if(type1[i] == type2[i]) {myType += type1[i];}
        else if (type1[i] == type3[i]) {myType += type1[i];}
        else if (type2[i] == type3[i]) {myType += type2[i];}
    }

    cout << "lowest distance three type: " << type1 << ", " << type2 << ", " << type3 << endl;
    cout << "My type is: " << myType << endl;
    cout << "My real type is: " << my_BMTI.type << endl;
}

int main()
{
    inputData();
    int* p;
    p = calculateDistance();
    for (int i = 0; i < BMTI_table_count; i++){BMTI_table[i].display();}
    findType(p);
    return 0;
}