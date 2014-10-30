pututline（将utmp 记录写入文件）
<pre>相关函数
getutent，getutid，getutline
表头文件
#include< utmp.h>
定义函数
void pututline(struct utmp *ut);
函数说明
pututline()用来将参数ut的utmp结构记录到utmp文件中。此函数会先用getutid()来取得正确的写入位置，如果没有找到相符的记录则会加入到utmp文件尾，utmp结构请参考getutent()。
返回值

附加说明
需要有写入/var/run/utmp 的权限
范例
#include< utmp.h>
main()
{
struct utmp ut;
ut.ut_type =USER_PROCESS;
ut.ut_pid=getpid();
strcpy(ut.ut_user,”kids”);
strcpy(ut.ut_line,”pts/1”);
strcpy(ut.ut_host,”www.gnu.org”);
pututline(&ut);
}
执行
/*执行范例后用指令who -l 观察*/
root pts/0 dec9 19:20
kids pts/1 dec12 10:31(www.gnu.org)
root pts/2 dec12 13:33
　
</pre>