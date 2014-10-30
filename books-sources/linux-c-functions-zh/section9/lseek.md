

lseek（移动文件的读写位置）
<pre>相关函数
dup，open，fseek
表头文件
#include< sys/types.h>
#include< unistd.h>
定义函数
off_t lseek(int fildes,off_t offset ,int whence);
函数说明
每一个已打开的文件都有一个读写位置，当打开文件时通常其读写位置是指向文件开头，若是以附加的方式打开文件(如O_APPEND)，则读写位置会指向文件尾。当read()或write()时，读写位置会随之增加，lseek()便是用来控制该文件的读写位置。参数fildes 为已打开的文件描述词，参数offset 为根据参数whence来移动读写位置的位移数。
参数
whence为下列其中一种:
SEEK_SET 参数offset即为新的读写位置。
SEEK_CUR 以目前的读写位置往后增加offset个位移量。
SEEK_END 将读写位置指向文件尾后再增加offset个位移量。
当whence 值为SEEK_CUR 或SEEK_END时，参数offet允许负值的出现。
下列是教特别的使用方式:
1) 欲将读写位置移到文件开头时:lseek（int fildes,0,SEEK_SET）；
2) 欲将读写位置移到文件尾时:lseek（int fildes，0,SEEK_END）；
3) 想要取得目前文件位置时:lseek（int fildes，0,SEEK_CUR）；
返回值
当调用成功时则返回目前的读写位置，也就是距离文件开头多少个字节。若有错误则返回-1，errno 会存放错误代码。
附加说明
Linux系统不允许lseek（）对tty装置作用，此项动作会令lseek（）返回ESPIPE。
范例
参考本函数说明</pre>