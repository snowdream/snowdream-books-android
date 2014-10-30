fdopen（将文件描述词转为文件指针）
相关函数
fopen，open，fclose
表头文件
#include<stdio.h>
定义函数
FILE * fdopen(int fildes,const char * mode);
函数说明
fdopen()会将参数fildes 的文件描述词，转换为对应的文件指针后返回。参数mode 字符串则代表着文件指针的流形态，此形态必须和原先文件描述词读写模式相同。关于mode 字符串格式请参考fopen()。
返回值
转换成功时返回指向该流的文件指针。失败则返回NULL，并把错误代码存在errno中。
范例
#include<stdio.h>
main()
{
FILE * fp =fdopen(0,”w+”);
fprintf(fp,”%s\n”,”hello!”);
fclose(fp);
}
执行
hello!