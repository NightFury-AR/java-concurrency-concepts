# Thread

- small process that executes the given tasks
- create a new Thread :
  - by extending Thread class 
  - by passing runnable object
- threads not runs in parallel , instead jvm makes it parallel by performing context switch
- thread's "run" method defines its behavior
- we can only start / enable the thread by calling its start() method

## Thread Termination
- threads consumes memory,kernel resources , also involved in CPU Cycles  and cache memory
- As soon as thread's work completed , then we need to clean up its resources
- in other cases , when thread went hung then we need to stop them to avoid the crash
- 