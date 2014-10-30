getgrent（从组文件中取得账号的数据）
相关函数
setgrent，endgrent
表头文件
#include<grp.h>
#include <sys/types.h>
定义函数
struct group *getgrent(void);
函数说明
getgrent()用来从组文件(/etc/group)中读取一项组数据，该数据以group 结构返回。第一次调用时会取得第一项组数据，之后每调用一次就会返回下一项数据，直到已无任何数据时返回NULL。
struct group{
char *gr_name; /*组名称*/
char *gr_passwd; /* 组密码*/
gid_t gr_gid; /*组识别码*/
char **gr_mem; /*组成员账号*/
}
返回值
返回group结构数据，如果返回NULL则表示已无数据，或有错误发生。
附加说明
getgrent()在第一次调用时会打开组文件，读取数据完毕后可使用endgrent()来关闭该组文件。
错误代码
ENOMEM 内存不足，无法配置group结构。
范例
#include<grp.h>
#include<sys/types.h>
main()
{
struct group *data;
int i;
while((data= getgrent())!=0){
i=0;
printf(“%s:%s:%d:”,data->gr_name,data->gr_passwd,data->gr_gid);
while(data->gr_mem[i])printf(“%s,”,data->gr_mem[i++]);
printf(“\n”);
}
endgrent();
}
执行
root:x:0:root,
bin:x:1:root,bin,daemon,
daemon:x:2:root,bin,daemon,
sys:x:3:root,bin,adm,
adm:x:4:root,adm,daemon
tty:x:5
disk:x:6:root
lp:x:7:daemon,lp
mem:x:8
kmem:x:9:
wheel:x:10:root
mail:x:12:mail
news:x:13:news
uucp:x:14:uucp
man:x:15:
games:x:20
gopher:x:30
dip:x:40
ftp:x:50
nobody:x:99