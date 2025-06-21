package com.example.myapplication.presentaition.di

import android.content.Context
import com.example.myapplication.data.databases.roomdatabase.database.AppRoomDatabase
import com.example.myapplication.data.databases.roomdatabase.repositories.courserepository.AddCourseRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.courserepository.GetCoursesRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.studentrepository.AddStudentRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.studentrepository.GetStudentsRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.teacherrepository.AddTeacherRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.teacherrepository.GetTeachersRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.userAccountRepository.InterUserAccountRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.userrepository.AddUserRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.userrepository.CheckUserRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.userrepository.GetLastUserRepositoryImpl
import com.example.myapplication.data.databases.roomdatabase.repositories.userrepository.GetUsersRepositoryImpl
import com.example.myapplication.domain.repositories.authenticationrepository.IInterUserAccountRepository
import com.example.myapplication.domain.repositories.courserepository.IAddCourseRepository
import com.example.myapplication.domain.repositories.courserepository.IGetCourseRepository
import com.example.myapplication.domain.repositories.studentrepository.IAddStudentRepository
import com.example.myapplication.domain.repositories.studentrepository.IGetStudentsRepository
import com.example.myapplication.domain.repositories.teacherrepository.IAddTeacherRepository
import com.example.myapplication.domain.repositories.teacherrepository.IGetTeachersRepository
import com.example.myapplication.domain.repositories.userrepository.IAddUserRepository
import com.example.myapplication.domain.repositories.userrepository.ICheckUserRepository
import com.example.myapplication.domain.repositories.userrepository.IGetLastUserRepository
import com.example.myapplication.domain.repositories.userrepository.IGetUsersRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideAppRoomDatabase(@ApplicationContext context: Context): AppRoomDatabase {
        return AppRoomDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideGetUsersRepository(database: AppRoomDatabase): IGetUsersRepository {
        return GetUsersRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideGetLastUserRepository(database: AppRoomDatabase): IGetLastUserRepository {
        return GetLastUserRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideCheckUserRepository(database: AppRoomDatabase): ICheckUserRepository {
        return CheckUserRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideAddUserRepository(database: AppRoomDatabase): IAddUserRepository {
        return AddUserRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideInterUserAccountRepository(database: AppRoomDatabase): IInterUserAccountRepository {
        return InterUserAccountRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideGetCourseRepository(database: AppRoomDatabase): IGetCourseRepository {
        return GetCoursesRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideAddCourseRepository(database: AppRoomDatabase): IAddCourseRepository {
        return AddCourseRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideAddStudentRepository(database: AppRoomDatabase): IAddStudentRepository {
        return AddStudentRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideGetStudentsRepository(database: AppRoomDatabase): IGetStudentsRepository {
        return GetStudentsRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideGetTeachersRepository(database: AppRoomDatabase): IGetTeachersRepository {
        return GetTeachersRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideAddTeacherRepository(database: AppRoomDatabase): IAddTeacherRepository {
        return AddTeacherRepositoryImpl(database)
    }
}
