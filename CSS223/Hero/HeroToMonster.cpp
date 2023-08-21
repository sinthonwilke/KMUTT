#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    const int n = 10;
    int hero_x = 1, hero_y = 0, monster_x = 10 - hero_x, monster_y = 5;   // เกิดวันอาทิตย์, เลขนักศึกษา 64090500450
    srand((unsigned)time(NULL));
    int arr[n][n] = {}; //coordinates : arr[y][x]

    arr[rand() % 10][rand() % 10] = 1;  //Tree
    arr[hero_y][hero_x] = 2;            //Hero
    arr[monster_y][monster_x] = 3;      //Monster

    for (int i = n - 1; i >= 0; i--)
    {
        for (int j = 0; j < n; j++)
        {
            cout << arr[i][j] << "   ";
        }
        cout << endl;
    }
    cout << "Euclidean: " << sqrt(pow(hero_x - monster_x, 2) + pow(hero_y - monster_y, 2)) << endl;
    cout << "Manhattan: " << abs(hero_x - monster_x) + abs(hero_y - monster_y) << endl;
    cout << "Chebychev: " << max(abs(hero_x - monster_x), abs(hero_y - monster_y)) <<endl;
    return 0;
}