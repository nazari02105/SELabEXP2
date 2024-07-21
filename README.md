# SELabEXP2
| نام          | شماره دانشجویی|
| ------------- | ------------- |
| علیرضا عالیپناه                  | 99106396      |
| سیدمحمدیوسف نجفی      | 99102361      |
| علی نظری                        | 99102401      |


جدول خواسته شده برای آزمایش اول به شرح زیر پر می‌شود:

<table dir='rtl'>
<tbody>

<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن کلاس جدید برای سفارش های از طریق موبایل</p>
</td>
<td width="292">
<p>در این کلاس که از واسط OrderService استفاده می کند، ۶ تابع موجود است که ۴ تای آن دارای بدنه خالی است و دو مورد از آن دارای پیاده سازی است که مربوط به ثبت سفارش و پرداخت از طریق موبایل است.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>ایجاد دو تابع جدید</p>
</td>
<td width="292">
<p>از آنجا که این کلاس از واسط OrderService استفاده می کند، با اضافه کردن متدهای مربوط به موبایلُ نیاز داشتیم که آن دو را در این کلاس هم قرار دهیم ولی با بدنه خالی.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>ایجاد دو تابع جدید</p>
</td>
<td width="292">
<p>از آنجا که این کلاس از واسط OrderService استفاده می کند، با اضافه کردن متدهای مربوط به موبایلُ نیاز داشتیم که آن دو را در این کلاس هم قرار دهیم ولی با بدنه خالی.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>ایجاد دو تابع جدید</p>
</td>
<td width="292">
<p>برای حالت موبایل نیاز بود که دو متد جدید اضافه شود تا در کلاس مربوطه پیاده شوند.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>یک else if جدید برای ثبت سفارش با موبایل</p>
</td>
<td width="292">
<p>نیاز بود تا ۳ خط اضافه شود برای ثبت سفارش با موبایل که در ان یک instance از PhoneOrderService گرفته می شود و متد phoneOrderRegister آن صدا زده می شود.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>یک else if برای پرداخت با موبایل</p>
</td>
<td width="292">
<p>نیاز بود تا ۲ خط اضافه شود برای پرداخت با موبایل که در آن متد phoneOrderPayment صدا زده می شود و جمع کل مبلغ به آن پاس داده می شود.</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: ۶ تغییر اصلی که معادل ۹ تغییر جزیی است.

مجموع تعداد خط اضافه شده: ۶۳ خط
### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>&nbsp;
کلاس Food.java این اصل را رعایت می‌کند. این کلاس فقط مسئول نگهداری اطلاعات اقلام غذایی است.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;
کلاس Order.java اصل Single Responsibility را نقض می‌کند. این کلاس وظیفه مدیریت سفارشات مشتری و محاسبه قیمت کل و همچنین قالب بندی سفارش برای خروجی را بر عهده دارد. این مسئولیت ها برای رعایت این اصل باید تفکیک شوند.
  کلاس Main.java نیز این اصل را نقض می‌کند. این کلاس تعامل کاربر، ایجاد سفارش و پرداخت را مدیریت می کند و در یک طراحی اصولی با رعایت این اصل باید این موارد تفکیک شوند.
  
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;
کلاس OrderService.java: از OCP پیروی می کند. این رابط اجازه می دهد تا انواع جدیدی از خدمات سفارش (به عنوان مثال، روش های پرداخت جدید) را بدون تغییر کد موجود اضافه کنیم.
  کلاس های OnlineOrderService.java و OnSiteOrderService.java: با پیاده سازی رابط OrderService اصل OCP را رعایت می‌کنند.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;
---
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;
---
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;
کلاس OrderService.java اصل LSP را نقض می کند. متدها در زیر کلاس‌ها (OnlineOrderService و OnSiteOrderService) وقتی قابل اجرا نیستند، بدنه‌های خالی دارند، که در صورت فراخوانی آن متدها می‌تواند منجر به رفتار نادرست شود.
  کلاس های OnlineOrderService.java وOnSiteOrderService.java نیز این اصل را به همان دلیل مشابه بالا نقض می‌کنند.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;
---
  
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;

کلاس OrderService.java اصل LSP را نقض می‌کند. این رابط پیاده سازی روش هایی را که توسط هر سرویسی استفاده نمی شود را اجبار می کند.

</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;
---
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>&nbsp;
کلاس Main.java این اصل را نقض می‌کند. زیرا طبق این اصل ماژول های سطح بالا نباید به ماژول های سطح پایین وابسته باشند. ولی در اینجا کلاس Main به طور مستقیم به پیاده سازی OnlineOrderService و OnSiteOrderService بستگی دارد.

</p>
</td>
</tr>
</tbody>
</table>


جدول لیست نقض ها و راهکار های آن ها:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>
