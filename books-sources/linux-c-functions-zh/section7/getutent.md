getutent（从utmp 文件中取得账号登录数据）
相关函数
getutent，getutid，getutline，setutent，endutent，pututline，utmpname
表头文件
#include<utmp.h>
定义函数
struct utmp *getutent(void);
函数说明
getutent()用来从utmp 文件(/var/run/utmp)中读取一项登录数据，该数据以utmp 结构返回。第一次调用时会取得第一位用户数据，之后每调用一次就会返回下一项数据，直到已无任何数据时返回NULL。
utmp结构定义如下
struct utmp
{
short int ut_type; /*登录类型*/
pid_t ut_pid; /*login进程的pid*/
char ut_line[UT_LINESIZE];/*登录装置名，省略了“/dev/”*/
char ut_id[4]; /* Inittab ID*/
char ut_user[UT_NAMESIZE];/*登录账号*/
char ut_host[UT_HOSTSIZE];/*登录账号的远程主机名称*/
struxt exit_status ut_exit;/* 当类型为DEAD_PROCESS时进程的结
束状态*/
long int ut_session; /*Sessioc ID*/
struct timeval ut_tv; /*时间记录*/
int32_t ut_addr_v6[4]; /*远程主机的网络地址*/
char __unused[20]; /* 保留未使用*/
};
ut_type有以下几种类型:
EMPTY 此为空的记录。
RUN_LVL 记录系统run－level的改变
BOOT_TIME 记录系统开机时间
NEW_TIME 记录系统时间改变后的时间
OLD_TINE 记录当改变系统时间时的时间。
INIT_PROCESS 记录一个由init衍生出来的进程。
LOGIN_PROCESS 记录login进程。
USER_PROCESS 记录一般进程。
DEAD_PROCESS 记录一结束的进程。
ACCOUNTING 目前尚未使用。
exit_status结构定义
struct exit_status
{
short int e_termination; /*进程结束状态*/
short int e_exit; /*进程退出状态*/
};
timeval的结构定义请参考gettimeofday（）。
相关常数定义如下:
UT_LINESIZE 32
UT_NAMESIZE 32
UT_HOSTSIZE 256
返回值
返回utmp 结构数据，如果返回NULL 则表示已无数据，或有错误发生。
附加说明
getutent()在第一次调用时会打开utmp 文件，读取数据完毕后可使用endutent()来关闭该utmp文件。
范例
#include<utmp.h>
main()
{
struct utmp *u;
while((u=getutent())){
if(u->ut_type = = USER_PROCESS)
printf(“%d %s %s %s \n”,u->ut_type,u->ut_user,u->ut_line,u->ut_host);
}
endutent();
}
执行
/* 表示有三个root账号分别登录/dev/pts/0，/dev/pts/1，/dev/pts/2 */
7 root pts/0
7 root pts/1
7 root pts/2