#include <iostream>
using namespace std;


class PolyLList
{
    private:
        int coef;
        int expo;
        PolyLList *next;

    public:
        PolyLList(PolyLList *next = NULL)
        {
            this->next = next;
        }
        PolyLList(int coef, int expo, PolyLList *next = NULL)
        {
            this->coef = coef;
            this->expo = expo;
            this->next = next;
        }
        PolyLList *getNext() {return this->next;}
        void setNext(PolyLList *next) {this->next = next;}
        void setCoef(int coef) {this->coef = coef;}
        void setExpo(int expo) {this->expo = expo;}
        int getCoef() {return coef;}
        int getExpo() {return expo;}
};

class LList
{
    private:
        PolyLList *head;
        PolyLList *tail;
        PolyLList *fence;
        void init() {fence = tail = head = new PolyLList;}
        void destroy()
        {
            while(head != NULL)
            {
                fence = head;
                head = head->getNext();
                delete fence;
            }
        }

    public:
        LList() {init();}
        ~LList() {destroy();}
        void insert(PolyLList *temp)
        {
            temp->setNext(fence->getNext());
            fence->setNext(temp);
        }
        void insertSort(int coef, int expo)
        {
            PolyLList *temp = new PolyLList(coef, expo);
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
                    if (expo > fence->getNext()->getExpo())
                    {
                        insert(temp);
                        break;
                    }
                    else
                    {
                        fenceNext();
                    }
                }
            }
        }
        void add(int coef, int expo)
        {
            fence = head;
            while(fence != tail)
            {
                fenceNext();
                if (fence->getExpo() == expo)
                {
                    fence->setCoef(fence->getCoef() + coef);
                }
            }
        }
        void mul(int coef, int expo)
        {
            fence = head;
            while(fence != tail)
            {
                fenceNext();
                fence->setCoef(fence->getCoef() * coef);
                fence->setExpo(fence->getExpo() + expo);
            }
        }
        void fenceNext()
        {
            if (fence->getNext() != NULL)
            {
                fence = fence->getNext();
            }
        }
        void print()
        {
            fence = head;
            while(fence != tail)
            {
                fenceNext();
                cout << fence->getCoef() << "x^" << fence->getExpo();
                if (fence->getNext() != NULL) {cout << " + ";}
            }
            cout << endl;
        }
};


int main()
{
    LList equation;
    cout << "equation" << endl;
    equation.insertSort(2,5);
    equation.insertSort(5,0);
    equation.insertSort(4,3);
    equation.insertSort(3,2);
    equation.print(); cout << endl;

    cout << "add 5x^5" << endl;
    equation.add(5,5);
    equation.print(); cout << endl;

    cout << "mul 2x^2" << endl;
    equation.mul(2,2); equation.print();

    return 0;
}