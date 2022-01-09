def BubbleSort(arr):
    n = len(arr)

    for i in range(0,n):
        swap = False
        for j in range(0, n-i-1):
            if(arr[j] > arr[j+1]):
                arr[j],arr[j+1] = arr[j+1], arr[j]
                swap = True
        if(swap == False):
            return arr
    return arr

if __name__ == "__main__":
    sample_arr = [23,20,15,10,7,1]
    sorted_arr = BubbleSort(sample_arr)
    print(sorted_arr)


# we can further optimize the bubble sort by checking whether the array is sorted or not by number of swaps happens.