telldir（取得目录流的读取位置）
<pre>相关函数
open，opendir，closedir，rewinddir，seekdir，readdir，scandir
表头文件
#include< dirent.h>
定义函数
off_t telldir(DIR *dir);
函数说明
telldir()返回参数dir目录流目前的读取位置。此返回值代表距离目录文件开头的偏移量返回值返回下个读取位置，有错误发生时返回-1。
错误代码
EBADF参数dir为无效的目录流。
范例
#include< sys/types.h>
#include< dirent.h>
#include< unistd.h>
main()
{
DIR *dir;
struct dirent *ptr;
int offset;
dir = opendir(“/etc/rc.d”);
while((ptr = readdir(dir))!=NULL)
{
offset = telldir (dir);
printf(“d_name : %s offset :%d\n”, ptr->d_name,offset);
}
closedir(dir);
}
执行
d_name : . offset :12
d_name : .. offset:24
d_name : init.d offset 40
d_name : rc0.d offset :56
d_name :rc1.d offset :72
d_name:rc2.d offset :88
d_name:rc3.d offset 104
d_name:rc4.d offset:120
d_name:rc5.d offset:136
d_name:rc6.d offset:152
d_name:rc offset 164
d_name:rc.local offset :180
d_name:rc.sysinit offset :4096</pre>