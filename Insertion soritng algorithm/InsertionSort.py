def InsertionSort(arr):
    n = len(arr)

    for i in range(1,n):
        key = arr[i]
        j = i - 1

        while (j>=0 and arr[j] > key):
            arr[j+1] = arr[j]
            j = j-1
        
        arr[j+1] = key
        print(arr)

    return arr

sample_arr = [1, 20,15, 10, 9,1]
print(sample_arr)
sorted_arr = InsertionSort(sample_arr)

print(sorted_arr)