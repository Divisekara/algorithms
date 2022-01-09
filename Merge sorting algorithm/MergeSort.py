# merge sort is a divide and conquer algorithm
# it divides input  array in two halves 
# calls itself for the two halves
# and then merges the two sorted halves

# two functions are involved in this algorithm
# the Merge() function us used for merging two halves
# the MergeSort() function recusively calles iself to divide the array till size becomes one.
# after dividing the array into smallest units merging starts based on comparison of elements

def merge_two_sorted_lists(a,b):
    a_idx = 0
    b_idx = 0
    sorted_list = []
    
    while (a_idx<len(a) and b_idx<len(b)):
        if(a[a_idx] <= b[b_idx]):
            sorted_list.append(a[a_idx])
            a_idx+=1
        elif(a[a_idx] > b[b_idx]):
            sorted_list.append(b[b_idx])
            b_idx+=1
    
    while(a_idx<len(a)):
        sorted_list.append(a[a_idx])
        a_idx+=1
    
    while(b_idx<len(b)):
        sorted_list.append(b[b_idx])
        b_idx+=1
    
    return sorted_list

def mergesort(arr):
    if(len(arr)<=1):
        return arr

    mid = len(arr) //2

    return merge_two_sorted_lists(mergesort(arr[:mid]),mergesort(arr[mid:]))

if __name__ == "__main__":
    sample_arr = [34,25,21,14,11,10,5,2,1]
    sorted_array = mergesort(sample_arr)
    print(sorted_array)

# to optimal in terms of space complexity you have to reduce the number of arrays used
