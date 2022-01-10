def quickSort(arr):
    n = len(arr)
    if(n<=1):
        return arr

    pivot = arr[0]
    left_arr = []
    right_arr = []
    
    for i in range(1,n):
        print(arr, n)
        if(pivot>=arr[i]):
            left_arr.append(arr[i])
        else:
            right_arr.append(arr[i])
    
    left = quickSort(left_arr)
    right = quickSort(right_arr)

    return (left + [pivot] + right)


if __name__ == "__main__":
    sample_arr = [50,40,30,20,10,0,0,0,0]
    sorted_arr = quickSort(sample_arr)
    print(sorted_arr)
