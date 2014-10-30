time（取得目前的时间）
相关函数
ctime，ftime，gettimeofday
表头文件
#include<time.h>
定义函数
time_t time(time_t *t);
函数说明
此函数会返回从公元1970年1月1日的UTC时间从0时0分0秒算起到现在所经过的秒数。如果t 并非空指针的话，此函数也会将返回值存到t指针所指的内存。
返回值
成功则返回秒数，失败则返回((time_t)-1)值，错误原因存于errno中。
范例
#include<time.h>
mian()
{
int seconds= time((time_t*)NULL);
printf(“%d\n”,seconds);
}
执行
9.73E+08