sscanf（格式化字符串输入）
<pre>相关函数
scanf，fscanf
表头文件
#include< stdio.h>
定义函数
int sscanf (const char *str,const char * format,........);
函数说明
sscanf()会将参数str的字符串根据参数format字符串来转换并格式化数据。格式转换形式请参考scanf()。转换后的结果存于对应的参数内。
返回值
成功则返回参数数目，失败则返回-1，错误原因存于errno中。
范例
#include< stdio.h>
main()
{
int i;
unsigned int j;
char input[ ]=”10 0x1b aaaaaaaa bbbbbbbb”;
char s[5];
sscanf(input,”%d %x %5[a-z] %*s %f”,&i,&j,s,s);
printf(“%d %d %s\n”,i,j,s);
}
执行
10 27 aaaaa</pre>