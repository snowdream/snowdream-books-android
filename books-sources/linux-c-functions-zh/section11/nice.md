nice（改变进程优先顺序）
相关函数
setpriority，getpriority
表头文件
#include<unistd.h>
定义函数
int nice(int inc);
函数说明
nice()用来改变进程的进程执行优先顺序。参数inc数值越大则优先顺序排在越后面，即表示进程执行会越慢。只有超级用户才能使用负的inc 值，代表优先顺序排在前面，进程执行会较快。
返回值
如果执行成功则返回0，否则返回-1，失败原因存于errno中。
错误代码
EPERM 一般用户企图转用负的参数inc值改变进程优先顺序。