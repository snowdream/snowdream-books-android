gettimeofday（取得目前的时间）
相关函数
time，ctime，ftime，settimeofday
表头文件
#include <sys/time.h>
#include <unistd.h>
定义函数
int gettimeofday ( struct timeval * tv , struct timezone * tz )
函数说明
gettimeofday()会把目前的时间有tv所指的结构返回，当地时区的信息则放到tz所指的结构中。
timeval结构定义为:
struct timeval{
long tv_sec; /*秒*/
long tv_usec; /*微秒*/
};
timezone 结构定义为:
struct timezone{
int tz_minuteswest; /*和Greenwich 时间差了多少分钟*/
int tz_dsttime; /*日光节约时间的状态*/
};
上述两个结构都定义在/usr/include/sys/time.h。tz_dsttime 所代表的状态如下
DST_NONE /*不使用*/
DST_USA /*美国*/
DST_AUST /*澳洲*/
DST_WET /*西欧*/
DST_MET /*中欧*/
DST_EET /*东欧*/
DST_CAN /*加拿大*/
DST_GB /*大不列颠*/
DST_RUM /*罗马尼亚*/
DST_TUR /*土耳其*/
DST_AUSTALT /*澳洲（1986年以后）*/
返回值
成功则返回0，失败返回－1，错误代码存于errno。附加说明EFAULT指针tv和tz所指的内存空间超出存取权限。
范例
#include<sys/time.h>
#include<unistd.h>
main(){
struct timeval tv;
struct timezone tz;
gettimeofday (&tv , &tz);
printf(“tv_sec; %d\n”, tv,.tv_sec) ;
printf(“tv_usec; %d\n”,tv.tv_usec);
printf(“tz_minuteswest; %d\n”, tz.tz_minuteswest);
printf(“tz_dsttime, %d\n”,tz.tz_dsttime);
}
执行
tv_sec: 974857339
tv_usec:136996
tz_minuteswest:-540
tz_dsttime:0