package com.example.myapplication.presentaition.di

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
import com.example.myapplication.domain.usecases.authenticationusecase.InterUserAccountUseCase
import com.example.myapplication.domain.usecases.courseusecase.AddCourseUseCase
import com.example.myapplication.domain.usecases.courseusecase.GetCoursesUseCase
import com.example.myapplication.domain.usecases.studentusecase.AddStudentUseCase
import com.example.myapplication.domain.usecases.studentusecase.GetStudentsUseCase
import com.example.myapplication.domain.usecases.teacherusecase.AddTeacherUseCase
import com.example.myapplication.domain.usecases.teacherusecase.GetTeachersUseCase
import com.example.myapplication.domain.usecases.userusecase.AddUserUseCase
import com.example.myapplication.domain.usecases.userusecase.CheckUserUseCase
import com.example.myapplication.domain.usecases.userusecase.GetUserUseCase
import com.example.myapplication.domain.usecases.userusecase.GetUsersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideAddUserUseCase(addUserRepository: IAddUserRepository): AddUserUseCase {
        return AddUserUseCase(addUserRepository)
    }

    @Provides
    fun provideGetUsersUseCase(getUsersRepository: IGetUsersRepository): GetUsersUseCase {
        return GetUsersUseCase(getUsersRepository)
    }

    @Provides
    fun provideGetUserUseCase(getLastUserRepository: IGetLastUserRepository): GetUserUseCase {
        return GetUserUseCase(getLastUserRepository)
    }

    @Provides
    fun provideCheckUserUseCase(checkUserRepository: ICheckUserRepository): CheckUserUseCase {
        return CheckUserUseCase(checkUserRepository)
    }

    @Provides
    fun provideInterUserAccountUseCase(interUserAccountRepository: IInterUserAccountRepository): InterUserAccountUseCase {
        return InterUserAccountUseCase(interUserAccountRepository)
    }

    @Provides
    fun provideGetTeachersUseCase(getTeachersRepository: IGetTeachersRepository): GetTeachersUseCase {
        return GetTeachersUseCase(getTeachersRepository)
    }

    @Provides
    fun provideAddTeacherUseCase(addTeacherRepository: IAddTeacherRepository): AddTeacherUseCase {
        return AddTeacherUseCase(addTeacherRepository)
    }

    @Provides
    fun provideGetStudentsUseCase(getStudentsRepository: IGetStudentsRepository): GetStudentsUseCase {
        return GetStudentsUseCase(getStudentsRepository)
    }

    @Provides
    fun provideAddStudentUseCase(addStudentRepository: IAddStudentRepository): AddStudentUseCase {
        return AddStudentUseCase(addStudentRepository)
    }

    @Provides
    fun provideGetCoursesUseCase(getCourseRepository: IGetCourseRepository): GetCoursesUseCase {
        return GetCoursesUseCase(getCourseRepository)
    }

    @Provides
    fun provideAddCourseUseCase(addCourseRepository: IAddCourseRepository): AddCourseUseCase {
        return AddCourseUseCase(addCourseRepository)
    }
}
