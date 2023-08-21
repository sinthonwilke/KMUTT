#include <iostream>
using namespace std;

int main() 
{

    const int n = 10;
    int hero_x = 7, hero_y = 0, monster_x = 3, monster_y = 5;   // เกิดวันอาทิตย์, เลขนักศึกษา 64090500450, 3 5
    //srand((unsigned)time(NULL));
    int arr[n][n] = {}; //coordinates : arr[y][x]

    arr[rand() % 10][rand() % 10] = 1;  //Tree
    arr[hero_y][hero_x] = 2;            //Hero
    arr[monster_y][monster_x] = 3;      //Monster

    for (int i = n-1 ; i >= 0; i--)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << "   ";
        }
        cout << endl;
    }

    return 0;
}