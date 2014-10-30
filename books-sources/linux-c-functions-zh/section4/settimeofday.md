settimeofday（设置目前时间）
<pre>相关函数
time，ctime，ftime，gettimeofday
表头文件
#include< sys/time.h>
#include< unistd.h>
定义函数
int settimeofday ( const struct timeval *tv,const struct timezone *tz);
函数说明
settimeofday()会把目前时间设成由tv所指的结构信息，当地时区信息则设成tz所指的结构。详细的说明请参考gettimeofday()。注意，只有root权限才能使用此函数修改时间。
返回值
成功则返回0，失败返回－1，错误代码存于errno。
错误代码
EPERM 并非由root权限调用settimeofday（），权限不够。
EINVAL 时区或某个数据是不正确的，无法正确设置时间。</pre>