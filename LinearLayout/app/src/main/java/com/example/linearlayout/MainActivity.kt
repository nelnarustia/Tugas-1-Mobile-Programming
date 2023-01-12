<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Ardian Arif Wahyudi"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

<LinearLayout
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="horizontal">
<TextView
android:id="@+id/tv1"
android:layout_width="60dp"
android:layout_height="250dp"
android:background="@android:color/holo_blue_bright"
android:gravity="center"
android:text="Ardian"
/>

<TextView
android:id="@+id/tv2"
android:layout_width="60dp"
android:layout_height="250dp"
android:background="@android:color/holo_orange_light"
android:gravity="center"
android:text="Arif" />

<TextView
android:id="@+id/tv3"
android:layout_width="60dp"
android:layout_height="250dp"
android:background="@android:color/holo_green_dark"
android:gravity="center"
android:text="Wahyudi" />

<TextView
android:id="@+id/tv4"
android:layout_width="60dp"
android:layout_height="250dp"
android:background="@android:color/holo_blue_dark"
android:gravity="center"
android:text="Adalah" />

<TextView
android:id="@+id/tv5"
android:layout_width="80dp"
android:layout_height="250dp"
android:background="@android:color/holo_orange_dark"
android:gravity="center"
android:text="Mahasiswa" />

<TextView
android:id="@+id/tv6"
android:layout_width="95dp"
android:layout_height="250dp"
android:background="@android:color/holo_red_dark"
android:gravity="center"
android:text="FTI " />
</LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>