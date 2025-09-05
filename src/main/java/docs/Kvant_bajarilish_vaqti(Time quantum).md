# Kvant bajarilsh vaqti (Time quantum) tushunchasi

## Kvant bajarilish vaqtini chunish uchun misol

- Tassavur qiling, sahnada 3 nafar ishtirokchi bor. Ular navbat bilan o'z fikrlarini aytishadi.
  Har bir ishtirokchi o'z fikrini aytish uchun 5 daqiqa vaqt oladi.
  Agar birinchi ishtirokchi 5 daqiqa ichida o'z fikrini aytib bo'lsa, navbat ikkinchi ishtirokchiga o'tadi.
  Agar ikkinchi ishtirokchi 5 daqiqa ichida o'z fikrini aytib bo'lmasa, navbat uchinchi ishtirokchiga o'tadi.
  Uchinchi ishtirokchi ham 5 daqiqa ichida o'z fikrini aytib bo'lmasa, navbat yana birinchi ishtirokchiga qaytadi.
  Bu jarayon barcha ishtirokchilar o'z fikrini aytib bo'lguncha davom etadi.

- Bu misolda har bir ishtirokchiga berilgan 5 daqiqa vaqt **"kvant bajarilish vaqti" (time quantum)** deb ataladi.

# OS da kvant bajarilish vaqti

- Thread Scheduler (Thread rejalashtiruvchi) har bir threadga ma'lum bir vaqt ajratadi, bu vaqt **kvant bajarilish vaqti
  ** deb ataladi.
  Agar thread o'z vazifasini kvant bajarilish vaqtida tugatmasa, u holda threadning bajarilishi to'xtatiladi va
  navbatdagi threadga o'tiladi.
  Aynan shu jarayon bizning dastur parallel ishlayotgandek ko'rsatadi. Aslida processor bir nechta threadlarni ishi
  o'rtasida juda tez almashib bajaradi
  Bu jarayon barcha threadlar o'z vazifalarini bajarib bo'lguncha davom etadi.

## Time Slice(Vaqt bo'lagi) tushunchasi

- **Time Slice** CPU kichik vaqt qismlariga bo'linadi (vaqt bo'lagi). Har bir Thread o'z vaqt bo'lagini oladi.
  Thread ajratilgan vaqt bo'lagini ishlatib bo'lgach, CPU navbatdagi Threadga o'tadi.

## Time Quantum (Vaqt kvanti) va Time Slice(vaqt bo'lagi) o'rtasidagi farq

- **Time Quantum** - bu Threadga berilgan maksimal vaqt miqdori. Masalat Thread-1 ishlash uchun 10ms kvant vaqti
  belgilandi. Demak u 10ms dan kop ishlay olmadi.
- **Time Slice** - bu CPU tomonidan Threadga berilgan haqiqiy vaqt miqdori. Masalan, Thread-1 10ms kvant vaqti
  belgilandi, lekin CPU unga faqat 7ms vaqt berdi. Demak uning vaqt bo'lagi 7ms bo'ladi.

# Nega Time Slice(Vaqt bo'lagi) Time Quantum(Vaqt kvanti) dan kichik bo'lishi mumkin?

- Buning sabab OS Thread-1 ishlashi uchun umumiy 10ms ajratdi(Time Quantum).
- Agar dastur ko'p processorli sistemada ishlasa u avvaol processor-0 da 7ms ishlab keyin processor-1 da 3ms ishlashi
  mumkin. Yoki Thread-2 ning prioriteti Thread-1 dan yuqori bo'lsa Scheduler Thread-1 ni to'xtatib Thread-2 ni
  ishlatishi mumkin.

---

## Time Quantum vs Time Slice

| **Kriteriy**   | **Time Quantum** (Vaqt kvanti)         | **Time Slice** (Vaqt bo‘lagi)           |
|----------------|----------------------------------------|-----------------------------------------|
| Ta’rif         | OS threadga beradigan maksimal vaqt    | CPU tomonidan amalda ajratilgan vaqt    |
| Kim belgilaydi | OS rejalashtirgichi (Scheduler)        | Apparat + rejalashtirgich               |
| Misol          | Threadga 10ms kvant vaqt berilgan      | CPU unga amalda faqat 7ms berdi         |
| Farq sababi    | Nazariya: yuqoridan chegaralangan vaqt | Amalda: uzilishlar, prioritetlar, yadro |

---

## Nazariya vs Amaliyot

| **Soha**        | **Nazariya**                         | **Amaliyot**                                  |
|-----------------|--------------------------------------|-----------------------------------------------|
| Bajarilish      | Jarayon kvant vaqtini to‘liq oladi   | Thread erta to‘xtatilishi mumkin              |
| Rejalashtirgich | Hammasi navbat bilan (round robin)   | Prioritetlar, I/O va yadrolar hisobga olinadi |
| Context switch  | Oddiy: “navbat berildi” deb qaraladi | Aslida qimmat jarayon (kesh tozalash va h.k.) |

## Context Switch (Kontekst almashinuvi) tushunchasi

- **Context Switch** - bu CPU bir Threaddan boshqasiga o'tganda yuzaga keladigan jarayon.
  Har bir Thread o'zining holatini (context) saqlaydi, bu holatga uning registrlari, dastur hisoblagichi va boshqa
  muhim ma'lumotlar kiradi.