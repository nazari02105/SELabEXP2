# SELabEXP2
تغییرات ایجاد شده سوال 3:
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
<p>Order</p>
</td>
<td width="141">
<p>تغییر مسیر و حذف getTotalPrice و toString</p>
</td>
<td width="292">
<p>این کلاس به پکیچOrderHandlers اضافه شده و دو تابع toString و getTotalPrice از آن حذف شده اند.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Food</p>
</td>
<td width="141">
<p>تغییر مسیر</p>
</td>
<td width="292">
<p>این کلاس به پکیچ پکیچOrderHandlers اضافه شده است.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>OrderFormatter</p>
</td>
<td width="141">
<p>ایجاد این کلاس و افزودن تابع format</p>
</td>
<td width="292">
<p>این کلاس سینگلتون به پکیج پکیچOrderHandlers اضافه شده و تابع format پیاده سازی شده است که یک order و یک OrderTotalPriceCalculator به عنوان ورودی دریافت کرده و سفارش را چاپ می کند.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>OrderTotalPriceCalculator</p>
</td>
<td width="141">
<p>ایجاد این کلاس و افزدون تابع calculateTotalPrice</p>
</td>
<td width="292">
<p>یک کلاس سینگلتون می باشد که در پکیج OrderHandlers قرار دارد و با دریافت یک order به عنوان ورودی،‌مجموع هزینه آن را محاسبه می کند.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>تغییر در واسط</p>
</td>
<td width="292">
<p>در واسط تغییر ایجاد شده بطوریکه اکنون تنها نیاز به پیاده سازی دو تابع registerOrder و proccessPayment می باشد.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>تغییر در توابع پیاده سازی شده</p>
</td>
<td width="292">
<p>توابع قدیمی مربوط به سفارش در سایت با دو تابع registerOrder و processPayment جایگزین شده اند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>تغییر در توابع پیاده سازی شده</p>
</td>
<td width="292">
<p>توابع قدیمی مربوط به سفارش آنلاین با دو تابع registerOrder و processPayment جایگزین شده اند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>ProcessPaymentService</p>
</td>
<td width="141">
<p>ایجاد کلاس جدید در پکیج CustomerServices</p>
</td>
<td width="292">
<p>این کلاس جدید در پکیج CustomerServices ایجاد شده است که وظیقه رسیدگی و پردازش پرداخت را دارد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>SelectOrderService</p>
</td>
<td width="141">
<p>ایجاد کلاس جدید در پکیج CustomerServices</p>
</td>
<td width="292">
<p>این کلاس جدید در پکیج CustomerServices ایجاد شده است که وظیقه رسیدگی به سفارش غذا را دارد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>SelectPaymentMethod</p>
</td>
<td width="141">
<p>ایجاد کلاس جدید در پکیج CustomerServices</p>
</td>
<td width="292">
<p>این کلاس جدید در پکیج CustomerServices ایجاد شده است که وظیقه انتخاب روش پرداخت را دارد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>7</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>تغییر در روند اجرای این کلاس</p>
</td>
<td width="292">
<p>در روند این کلاس تغییراتی ایجاد شده است تا با استفاده از کلاس های CustomerServices،‌رسیدگی به مشتری انجام شود و به اصول SOLID نیز رسیدگی شود.</p>
</td>
</tr>

</tbody>
</table>
پاسخ سوال 4:
<br>
بخش الف)
<br>
در ردیف یک دیگر نیازی به پیاده سازی چهار تابع اضافی نمی باشد.
<br>
نیاز به پیاده سازی ردیف های 2 و 3 و 4 و 5 و 6 نیست.
<br>
نیاز است تا به کلاس SelectPaymentMethod یک خط برای انتخاب روش پرداخت PhoneOrderService اضافه شود.
<br>
بخش ب)
<br>
مجموع تعداد تغییرات: یک تغییر اصلی برای اضافه کردن کلاس PhoneOrderService و یک تغییر جزئی برای اضافه کردن آن به SelectPaymentMethod.
<br>
مجموع تعداد خط اضافه شده: 14

