package week14d03;

 enum Rating {
     JELES(5), JÓ(4), KÖZEPES(3), ELÉGSÉGES(2), ELÉGTELEN(1);
     int value;

     Rating(int value) {
         this.value = value;
     }
 }
