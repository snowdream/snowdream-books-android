fgetc（由文件中读取一个字符）
<pre>相关函数
open，fread，fscanf，getc
表头文件
include< stdio.h>
定义函数
nt fgetc(FILE * stream);
函数说明
fgetc()从参数stream所指的文件中读取一个字符。若读到文件尾而无数据时便返回EOF。
返回值
getc()会返回读取到的字符，若返回EOF则表示到了文件尾。
范例
#include< stdio.h>
main()
{
FILE *fp;
int c;
fp=fopen(“exist”,”r”);
while((c=fgetc(fp))!=EOF)
printf(“%c”,c);
fclose(fp);
}</pre>