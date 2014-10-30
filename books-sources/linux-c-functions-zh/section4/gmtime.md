gmtime（取得目前时间和日期）
<pre>相关函数
time,asctime,ctime,localtime
表头文件
#include< time.h>
定义函数
struct tm*gmtime(const time_t*timep);
函数说明
gmtime()将参数timep 所指的time_t 结构中的信息转换成真实世界所使用的时间日期表示方法，然后将结果由结构tm返回。
结构tm的定义为
struct tm
{
int tm_sec;
int tm_min;
int tm_hour;
int tm_mday;
int tm_mon;
int tm_year;
int tm_wday;
int tm_yday;
int tm_isdst;
};
int tm_sec 代表目前秒数，正常范围为0-59，但允许至61秒
int tm_min 代表目前分数，范围0-59
int tm_hour 从午夜算起的时数，范围为0-23
int tm_mday 目前月份的日数，范围01-31
int tm_mon 代表目前月份，从一月算起，范围从0-11
int tm_year 从1900 年算起至今的年数
int tm_wday 一星期的日数，从星期一算起，范围为0-6
int tm_yday 从今年1月1日算起至今的天数，范围为0-365
int tm_isdst 日光节约时间的旗标
此函数返回的时间日期未经时区转换，而是UTC时间。
返回值
返回结构tm代表目前UTC 时间
范例
#include < time.h>
main(){
char *wday[]={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
time_t timep;
struct tm *p;
time(&timep);
p=gmtime(&timep);
printf(“%d%d%d”,(1900+p->tm_year), (1+p->tm_mon),p->tm_mday);
printf(“%s%d;%d;%d\n”, wday[p->tm_wday], p->tm_hour, p->tm_min, p->tm_sec);
}
执行
2000/10/28 Sat 8:15:38</pre>