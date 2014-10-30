freopen（打开文件）
<pre>相关函数
fopen，fclose
表头文件
#include< stdio.h>
定义函数
FILE * freopen(const char * path,const char * mode,FILE * stream);
函数说明
参数path字符串包含欲打开的文件路径及文件名，参数mode请参考fopen()说明。参数stream为已打开的文件指针。Freopen()会将原stream所打开的文件流关闭，然后打开参数path的文件。
返回值
文件顺利打开后，指向该流的文件指针就会被返回。如果文件打开失败则返回NULL，并把错误代码存在errno 中。
范例
#include< stdio.h>
main()
{
FILE * fp;
fp=fopen(“/etc/passwd”,”r”);
fp=freopen(“/etc/group”,”r”,fp);
fclose(fp);
}</pre>