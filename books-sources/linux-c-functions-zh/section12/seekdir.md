seekdir（设置下回读取目录的位置）
相关函数
open，opendir，closedir，rewinddir，telldir，readdir，scandir
表头文件
#include<dirent.h>
定义函数
void seekdir(DIR * dir,off_t offset);
函数说明
seekdir()用来设置参数dir目录流目前的读取位置，在调用readdir()时便从此新位置开始读取。参数offset 代表距离目录文件开头的偏移量。
返回值

错误代码
EBADF 参数dir为无效的目录流
范例
#include<sys/types.h>
#include<dirent.h>
#include<unistd.h>
main()
{
DIR * dir;
struct dirent * ptr;
int offset,offset_5,i=0;
dir=opendir(“/etc/rc.d”);
while((ptr = readdir(dir))!=NULL)
{
offset = telldir(dir);
if(++i = =5) offset_5 =offset;
printf(“d_name :%s offset :%d \n”,ptr->d_name,offset);
}
seekdir(dir offset_5);
printf(“Readdir again!\n”);
while((ptr = readdir(dir))!=NULL)
{
offset = telldir(dir);
printf(“d_name :%s offset :%d\n”,ptr->d_name.offset);
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
d_name:rc.sysinit offset :4096
readdir again!
d_name:rc2.d offset :88
d_name:rc3.d offset 104
d_name:rc4.d offset:120
d_name:rc5.d offset:136
d_name:rc6.d offset:152
d_name:rc offset 164
d_name:rc.local offset :180
d_name:rc.sysinit offset :4096