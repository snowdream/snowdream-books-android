rewinddir（重设读取目录的位置为开头位置）
<pre>相关函数
open，opendir，closedir，telldir，seekdir，readdir，scandir
表头文件
#include< sys/types.h>
#include< dirent.h>
定义函数
void rewinddir(DIR *dir);
函数说明
rewinddir()用来设置参数dir 目录流目前的读取位置为原来开头的读取位置。
返回值

错误代码
EBADF dir为无效的目录流
范例
#include< sys/types.h>
#include< dirent.h>
#include< unistd.h>
main()
{
DIR * dir;
struct dirent *ptr;
dir = opendir(“/etc/rc.d”);
while((ptr = readdir(dir))!=NULL)
{
printf(“d_name :%s\n”,ptr->d_name);
}
rewinddir(dir);
printf(“readdir again!\n”);
while((ptr = readdir(dir))!=NULL)
{
printf(“d_name: %s\n”,ptr->d_name);
}
closedir(dir);
}
执行
d_name:.
d_name:..
d_name:init.d
d_name:rc0.d
d_name:rc1.d
d_name:rc2.d
d_name:rc3.d
d_name:rc4.d
d_name:rc5.d
d_name:rc6.d
d_name:rc
d_name:rc.local
d_name:rc.sysinit
readdir again!
d_name:.
d_name:..
d_name:init.d
d_name:rc0.d
d_name:rc1.d
d_name:rc2.d
d_name:rc3.d
d_name:rc4.d
d_name:rc5.d
d_name:rc6.d
d_name:rc
d_name:rc.local
d_name:rc.sysinit</pre>