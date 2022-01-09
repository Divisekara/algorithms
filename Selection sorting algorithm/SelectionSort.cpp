#include <iostream>
using namespace std;

int main()
{
    int arr[] = {22, 15, 10, 7, 3, 1};
    int n = sizeof(arr) / sizeof(arr[0]);

    for (int i = 0; i < n; i++)
    {
        int min_idx = i;
        for (int j = i + 1; j < n; j++)
        {
            if (arr[min_idx] > arr[j])
            {
                min_idx = j;
            }
        }
        int minimum = arr[min_idx];
        int key = arr[i];
        arr[min_idx] = key;
        arr[i] = minimum;
    }

    for (int k = 0; k < n; k++)
    {
        cout << arr[k] << " ";
    }
    cout << endl;
}