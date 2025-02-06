[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17908280&assignment_repo_type=AssignmentRepo)
# ArrayReduction
Given an array, reduce the array to a single value with the minimum cost.   You must use a PriorityQueue.

```
Given array 1,2,3 
Add all values to a priority queue
Get the 2 smallest values and add their sum back to the pq
The queue would contain 3,3
The min cost so far is 3
Get the 2 smallest values and add their sum back to the pq
The queue would contain 6
The min cost is 9
The loop stops when the pq has a single value
```

## Sample Data : 
```
212
25,10,20
1,2,3
1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999
1,1,1,1,1
1,1
```

## Sample Output :
```
0
85
9
947
12
2
```

