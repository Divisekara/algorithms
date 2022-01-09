#include <iostream>
using namespace std;

int main()
{
    int arr[] = {25, 20, 14, 11, 9, 1};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                int left = arr[j];
                int right = arr[j + 1];
                arr[j] = right;
                arr[j + 1] = left;
            }
        }
    }

    for (int k = 0; k < n; k++)
    {
        cout << arr[k] << " ";
    }
    cout << endl;
}