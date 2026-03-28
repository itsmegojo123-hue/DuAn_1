#include <iostream>

using namespace std;

int main()
{
    int a, b, c;
    cout << "- Nhap 3 canh a, b, c: ";
    cin >> a >> b >> c;

    if(a + b > c & b + c > a & a + c > b)
    {
        cout << "Day la tam giac";
    }
    else
    {
        cout << "Day khong phai la tam giac" << endl;
    }
}
