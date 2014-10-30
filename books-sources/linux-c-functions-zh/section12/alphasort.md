alphasort（依字母顺序排序目录结构）
<pre>相关函数
scandir，qsort
表头文件
#include< dirent.h>
定义函数
int alphasort(const struct dirent **a,const struct dirent **b);
函数说明
alphasort()为scandir()最后调用qsort()函数时传给qsort()作为判断的函数，详细说明请参考scandir()及qsort()。
返回值
参考qsort()。
范例
/* 读取/目录下所有的目录结构，并依字母顺序排列*/
main()
{
struct dirent **namelist;
int i,total;
total = scandir(“/”,&namelist ,0,alphasort);
if(total <0)
perror(“scandir”);
else{
for(i=0;i<total;i++)
printf(“%s\n”,namelist[i]->d_name);
printf(“total = %d\n”,total);
}
}
执行
..
.gnome
.gnome_private
ErrorLog
Weblog
bin
boot
dev
dosc
dosd
etc
home
lib
lost+found
misc
mnt
opt
proc
root
sbin
tmp
usr
var
total = 24</pre>