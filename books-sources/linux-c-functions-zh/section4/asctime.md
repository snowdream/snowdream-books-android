asctime（将时间和日期以字符串格式表示）
<pre>相关函数
time，ctime，gmtime，localtime
表头文件
#include< time.h>
定义函数
char * asctime(const struct tm * timeptr);
函数说明
asctime()将参数timeptr所指的tm结构中的信息转换成真实世界所使用的时间日期表示方法，然后将结果以字符串形态返回。此函数已经由时区转换成当地时间，字符串格式为:“Wed Jun 30 21:49:08 1993\n”
返回值
若再调用相关的时间日期函数，此字符串可能会被破坏。此函数与ctime不同处在于传入的参数是不同的结构。
附加说明
返回一字符串表示目前当地的时间日期。
范例
#include < time.h>
main()
{
time_t timep;
time (&timep);
printf(“%s”,asctime(gmtime(&timep)));
}
执行
Sat Oct 28 02:10:06 2000</pre>