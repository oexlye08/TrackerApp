package id.my.okisulton.trackerapp.di

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ServiceScoped
import id.my.okisulton.trackerapp.R
import id.my.okisulton.trackerapp.ui.MainActivity
import id.my.okisulton.trackerapp.util.Constants.ACTION_NAVIGATE_TO_MAPS_FRAGMENT
import id.my.okisulton.trackerapp.util.Constants.NOTIFICATION_CHANNEL_ID
import id.my.okisulton.trackerapp.util.Constants.PENDING_INTENT_REQUEST_CODE

/**
 *Created by osalimi on 25-01-2022.
 **/
@Module
@InstallIn(ServiceComponent::class)
object NotificationModule {

    @ServiceScoped
    @Provides
    fun providePendingIntent(
        @ApplicationContext context: Context
    ): PendingIntent {
        return PendingIntent.getActivity(
            context,
            PENDING_INTENT_REQUEST_CODE,
            Intent(context, MainActivity::class.java).apply {
                this.action = ACTION_NAVIGATE_TO_MAPS_FRAGMENT
            },
            PendingIntent.FLAG_UPDATE_CURRENT
        )
    }

    @ServiceScoped
    @Provides
    fun provideNotificationBuilder(
        @ApplicationContext context: Context,
        pendingIntent: PendingIntent
    ): NotificationCompat.Builder {
        return NotificationCompat.Builder(context, NOTIFICATION_CHANNEL_ID)
            .setAutoCancel(false)
            .setOngoing(true)
            .setSmallIcon(R.drawable.ic_run)
            .setContentIntent(pendingIntent)
            .setContentTitle("TrackerApp is running")
    }

    @ServiceScoped
    @Provides
    fun provideNotificationManager(
        @ApplicationContext context: Context
    ): NotificationManager {
        return context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }
}