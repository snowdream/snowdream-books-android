fprintf（格式化输出数据至文件）
<pre>相关函数
printf，fscanf，vfprintf
表头文件
#include< stdio.h>
定义函数
int fprintf(FILE * stream, const char * format,.......);
函数说明
fprintf()会根据参数format字符串来转换并格式化数据，然后将结果输出到参数stream指定的文件中，直到出现字符串结束('\0')为止。
返回值
关于参数format字符串的格式请参考printf()。成功则返回实际输出的字符数，失败则返回-1，错误原因存于errno中。
范例
#include< stdio.h>
main()
{
int i = 150;
int j = -100;
double k = 3.14159;
fprintf(stdout,”%d %f %x \n”,j,k,i);
fprintf(stdout,”%2d %*d\n”,i,2,i);
}
执行
-100 3.141590 96
150 150</pre>