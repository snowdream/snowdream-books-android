setpriority（设置程序进程执行优先权）
相关函数
getpriority，nice
表头文件
#include<sys/time.h>
#include<sys/resource.h>
定义函数
int setpriority(int which,int who, int prio);
函数说明
setpriority()可用来设置进程、进程组和用户的进程执行优先权。参数which有三种数值，参数who 则依which值有不同定义
which who 代表的意义
PRIO_PROCESS who为进程识别码
PRIO_PGRP who 为进程的组识别码
PRIO_USER who为用户识别码
参数prio介于-20 至20 之间。代表进程执行优先权，数值越低代表有较高的优先次序，执行会较频繁。此优先权默认是0，而只有超级用户（root）允许降低此值。
返回值
执行成功则返回0，如果有错误发生返回值则为-1，错误原因存于errno。
ESRCH 参数which或who 可能有错，而找不到符合的进程
EINVAL 参数which值错误。
EPERM 权限不够，无法完成设置
EACCES 一般用户无法降低优先权