# Process va Thread tushunchasi

## Asosiy tushunchalar

- **Process** -> Ajratilgan alohida xotira, resurslarga (fayllar, papkalar va boshqalar) ega bo'lgan bajaruvchi
  dasturdir.
  Har bir Process o'zining alohida xotira maydoniga ega va boshqa Processlar bilan xotira maydonini bo'lishmaydi.
  Shuning uchun bir Processdagi o'zgarishlar boshqa Processlarga ta'sir qilmaydi.

- **Thread** -> Process ichida ish bajarish birligi. Har bir Thread o'zining stackiga ega
  Ya'ni yangi thread yaratilib .start() metodi chaqirilgandan so'ng JVM xotira mayodoni (Data Area)da yangi stack
  yaratiladi.
  Eslatma: new Thread() chaqirilganda yangi stack yaratilmaydi, balki faqat .start() metodi chaqirilganda yangi stack
  yaratiladi.
  Lekin Process ichidagi barcha Threadlar umumiy xotira maydoni va resurslarga ega.

# Process va Thread orasidagi farqlar:

- Process yaratish Thread yaratishga nisbatan ko'proq vaqt va ko'p resurslar talab qiladi.
  Process yaratish Thread yaratishga nisbatan qimmatroq.
- Har bir Process o'zining alohida xotira maydoniga ega bo'gani uchun bir Processdagi o'zgarishlar boshqa Processlarga
  ta'sir qilmaydi. Biroq, bir Process ichidagi Threadlar Processning xotira maydonini bo'lishadi, shuning uchun bir
  Threaddagi o'zgarishlar boshqa Threadlarga ta'sir qilishi mumkin.
  Processlarni o'lishi uning ichidagi barcha Threadlarni o'ldiradi.
  Threadning o'lishi faqat o'sha Threadga ta'sir qiladi.

---

    | Xususiyat             | Process                                         | Thread                                   |
    |-----------------------|-------------------------------------------------|------------------------------------------|
    | Xotria (Memory)       | Har bir process o'ziga alohida                  | Umumiy xotira bo'lishiladi               | 
    | Stack                 | Umumiy emas                                     | Har bir thread uchun alohida stack       |
    | Yaratish narxi        | Qimmat (resurs ko'p oladi)                      | Arzonroq                                 |
    | Ta’siri               | Boshqa processlarga ta’sir qilmaydi             | Boshqa threadlarga ta’sir qilishi mumkin |
    | O‘lim (termination)   | Process o‘lsa, ichidagi barcha threadlar o‘ladi | Thread o‘lsa, faqat o‘zi to‘xtaydi       |

---

# Qisqa tushunchalar:

- **Process**: Bu konteyner.
- **Thread**: Bu konteyner ichidagi ishchi.