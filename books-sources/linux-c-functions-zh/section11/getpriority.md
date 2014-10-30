getpriority（取得程序进程执行优先权）
<pre>相关函数
setpriority，nice
表头文件
#include< sys/time.h>
#include< sys/resource.h>
定义函数
int getpriority(int which,int who);
函数说明
getpriority()可用来取得进程、进程组和用户的进程执行优先权。
参数
which有三种数值，参数who 则依which值有不同定义
which who 代表的意义
PRIO_PROCESS who 为进程识别码
PRIO_PGRP who 为进程的组识别码
PRIO_USER who 为用户识别码
此函数返回的数值介于-20 至20之间，代表进程执行优先权，数值越低代表有较高的优先次序，执行会较频繁。
返回值
返回进程执行优先权，如有错误发生返回值则为-1 且错误原因存于errno。
附加说明
由于返回值有可能是-1，因此要同时检查errno是否存有错误原因。最好在调用次函数前先清除errno变量。
错误代码
ESRCH 参数which或who 可能有错，而找不到符合的进程。EINVAL 参数which 值错误。</pre>