localtime（取得当地目前时间和日期）
相关函数
time, asctime, ctime, gmtime
表头文件
#include<time.h>
定义函数
struct tm *localtime(const time_t * timep);
函数说明
localtime()将参数timep所指的time_t结构中的信息转换成真实世界所使用的时间日期表示方法，然后将结果由结构tm返回。结构tm的定义请参考gmtime()。此函数返回的时间日期已经转换成当地时区。
返回值
返回结构tm代表目前的当地时间。
范例
#include<time.h>
main(){
char *wday[]={“Sun”,”Mon”,”Tue”,”Wed”,”Thu”,”Fri”,”Sat”};
time_t timep;
struct tm *p;
time(&timep);
p=localtime(&timep); /*取得当地时间*/
printf (“%d%d%d ”, (1900+p->tm_year),( l+p->tm_mon), p->tm_mday);
printf(“%s%d:%d:%d\n”, wday[p->tm_wday],p->tm_hour, p->tm_min, p->tm_sec);
}
执行
2000/10/28 Sat 11:12:22