fgetgrent（从指定的文件来读取组格式）
<pre>相关函数
fgetpwent
表头文件
#include< grp.h>
#include< stdio.h>
#include< sys/types.h>
定义函数
struct group * getgrent(FILE * stream);
函数说明
fgetgrent()会从参数stream指定的文件读取一行数据，然后以group结构将该数据返回。参数stream所指定的文件必须和、etc/group相同的格式。group结构定义请参考getgrent()。
返回值
返回group结构数据，如果返回NULL则表示已无数据，或有错误发生。
范例
#include < grp.h>
#include< sys/types.h>
#include< stdio.h>
main()
{
struct group *data;
FILE *stream;
int i;
stream = fopen("/etc/group", "r");
while((data = fgetgrent(stream))!=0){
i=0;
printf("%s :%s:%d :", data->gr_name,data->gr_passwd,data->gr_gid);
while (data->gr_mem[i])printf("%s,",data->gr_mem[i++]);
printf("\n");
}
fclose(stream);
}
执行
root:x:0:root,
bin:x:1:root,bin,daemon
daemon:x:2:root,bin,daemon
sys:x:3:root,bin,adm
adm:x:4:root,adm,daemon
tty:x:5
disk:x:6:root
lp:x:7:daemon,lp
mem:x:8
kmem:x:9
wheel:x:10:root
mail:x:12:mail
news:x:13:news
uucp:x:14:uucp
man:x:15
games:x:20
gopher:x:30
dip:x:40:
ftp:x:50
nobody:x:99:</pre>