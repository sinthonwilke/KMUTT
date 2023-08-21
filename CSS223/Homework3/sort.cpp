#include <algorithm>
#include <iostream>
using namespace std;

struct multiColumn
{
    int NO, A, B, C;
};

void display(multiColumn* mc, int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << "NO: " << mc[i].NO << "\tA: " << mc[i].A << "\tB: " << mc[i].B << "\tC: " << mc[i].C << endl;
    }
}

bool mc_sorterA(multiColumn const& lhs, multiColumn const& rhs)
{
    if (lhs.A < rhs.A) {return true;}
    return false;
}
bool mc_sorterB(multiColumn const& lhs, multiColumn const& rhs)
{
    if (lhs.B < rhs.B) {return true;}
    return false;
}
bool mc_sorterC(multiColumn const& lhs, multiColumn const& rhs)
{
    if (lhs.C < rhs.C) {return true;}
    return false;
}

int main()
{
    multiColumn mc[14];
    mc[0] = {1,1,1,4};
    mc[1] = {2,3,1,1};
    mc[2] = {3,4,4,4};
    mc[3] = {4,2,4,4};
    mc[4] = {5,3,5,3};
    mc[5] = {6,4,3,3};
    mc[6] = {7,1,3,3};
    mc[7] = {8,2,4,3};
    mc[8] = {9,3,3,5};
    mc[9] = {10,1,5,3};
    mc[10] = {11,1,1,4};
    mc[11] = {12,4,1,1};
    mc[12] = {13,5,2,3};
    mc[13] = {14,3,5,2};

    cout << "Before sort" << endl;
    display(mc, 14); cout << endl;

    cout << "Sorted by A->B->C" << endl;
    sort(mc, mc+14, &mc_sorterC);
    sort(mc, mc+14, &mc_sorterB);
    sort(mc, mc+14, &mc_sorterA);
    display(mc, 14); cout << endl;

    cout << "Sorted by B->C->A" << endl;
    sort(mc, mc+14, &mc_sorterA);
    sort(mc, mc+14, &mc_sorterC);
    sort(mc, mc+14, &mc_sorterB);
    display(mc, 14); cout << endl;
}
