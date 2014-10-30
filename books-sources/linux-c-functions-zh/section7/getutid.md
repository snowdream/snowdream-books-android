getutid（从utmp 文件中查找特定的记录）
相关函数
getutent，getutline
表头文件
#include<utmp.h>
定义函数
strcut utmp *getutid(strcut utmp *ut);
函数说明
getutid()用来从目前utmp 文件的读写位置逐一往后搜索参数ut指定的记录，如果ut->ut_type 为RUN_LVL，BOOT_TIME，NEW_TIME，OLD_TIME 其中之一则查找与ut->ut_type 相符的记录；若ut->ut_type 为INIT_PROCESS，LOGIN_PROCESS，USER_PROCESS或DEAD_PROCESS其中之一，则查找与ut->ut_id相符的记录。找到相符的记录便将该数据以utmp 结构返回。utmp结构请参考getutent()。
返回值
返回utmp 结构数据，如果返回NULL 则表示已无数据，或有错误发生。
范例
#include<utmp.h>
main()
{
struct utmp ut,*u;
ut.ut_type=RUN_LVL;
while((u= getutid(&ut))){
printf(“%d %s %s %s\n”,u->ut_type,u->ut_user,u->ut_line,u->ut_host);
}
}
执行
1 runlevel -