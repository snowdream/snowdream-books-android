fwrite（将数据写至文件流）
<pre>相关函数
fopen，fread，fseek，fscanf
表头文件
#include< stdio.h>
定义函数
size_t fwrite(const void * ptr,size_t size,size_t nmemb,FILE * stream);
函数说明
fwrite()用来将数据写入文件流中。参数stream为已打开的文件指针，参数ptr 指向欲写入的数据地址，总共写入的字符数以参数size*nmemb来决定。Fwrite()会返回实际写入的nmemb数目。
返回值
返回实际写入的nmemb数目。
范例
#include< stdio.h>
#define set_s (x,y) {strcoy(s[x].name,y);s[x].size=strlen(y);}
#define nmemb 3
struct test
{
char name[20];
int size;
}s[nmemb];
main()
{
FILE * stream;
set_s(0,”Linux!”);
set_s(1,”FreeBSD!”);
set_s(2,”Windows2000.”);
stream=fopen(“/tmp/fwrite”,”w”);
fwrite(s,sizeof(struct test),nmemb,stream);
fclose(stream);
}
执行
参考fread（）。</pre>
　
