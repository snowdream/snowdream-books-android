sprintf（格式化字符串复制）
<pre>相关函数
printf，sprintf
表头文件
#include< stdio.h>
定义函数
int sprintf( char *str,const char * format,.........);
函数说明
sprintf()会根据参数format字符串来转换并格式化数据，然后将结果复制到参数str所指的字符串数组，直到出现字符串结束(’\0’)为止。关于参数format字符串的格式请参考printf()。
返回值
成功则返回参数str字符串长度，失败则返回-1，错误原因存于errno中。
附加说明
使用此函数得留意堆栈溢出，或改用snprintf（）。
范例
#include< stdio.h>
main()
{
char * a=”This is string A!”;
char buf[80];
sprintf(buf,”>>> %s<<<\n”,a);
printf(“%s”.buf);
}
执行
>>>This is string A!<<<</pre>