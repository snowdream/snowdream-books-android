getutline（从utmp 文件中查找特定的记录）
<pre>相关函数
getutent，getutid，pututline
表头文件
#include< utmp.h>
定义函数
struct utmp * getutline (struct utmp *ut);
函数说明
getutline()用来从目前utmp文件的读写位置逐一往后搜索ut_type为USER_PROCESS 或LOGIN_PROCESS 的记录，而且ut_line 和ut->ut_line 相符。找到相符的记录便将该数据以utmp 结构返回，utmp结构请参考getutent()。
返回值
返回utmp 结构数据，如果返回NULL 则表示已无数据，或有错误发生。
范例
#include< utmp.h>
main()
{
struct utmp ut,*u;
strcpy (ut.ut_line,”pts/1”);
while ((u=getutline(&ut))){
printf(“%d %s %s %s \n”,u->ut_type,u->ut_user,u->ut_line,u->ut_host);
}
}
执行
7 root pts/1</pre>