var gulp = require('gulp');
var browserSync = require('browser-sync').create();
var compass = require('gulp-compass');
var sourcemaps = require('gulp-sourcemaps');
var path = require('path');

// Browser-sync
gulp.task('browser-sync-proxy', function() {
    browserSync.init({
        proxy: "localhost:9000"
    });
});
gulp.task('browser-sync-serve', function() {
    browserSync.init({
        server: {
            baseDir: "public",
            index: "index.htm"
        }
    });
});

// Sass
gulp.task('sass', function() {
    return gulp.src('assets/stylesheets/main.sass')
        .pipe(compass({
            sourcemap: true,
            css: "public/stylesheets",
            http_path: "public",
            sass: "assets/stylesheets",
            image: "assets/images",
            font: "assets/fonts",
        }))
        .on('error', function (err) {
            console.error('Error!', err.message);
        })
        .pipe(sourcemaps.write('public/stylesheets', {
            includeContent: false,
            sourceRoot: 'assets/stylesheets'
        }))
        .pipe(gulp.dest('public/stylesheets'))
        .pipe(browserSync.stream({match: '**/*.css'}));
});


// JS
gulp.task('js', function() {
    // TODO ...
});

// Statics
gulp.task('copy', function() {
    return gulp.src('assets/index.htm')
        .pipe(gulp.dest('public'))
});
gulp.task('copy-reload', ['copy'], browserSync.reload)

// Watch
gulp.task('watch', function() {
  gulp.watch('assets/stylesheets/**/*.sass', ['sass']);
  gulp.watch('assets/javascripts/**/*.js', ['js']);
  gulp.watch('assets/index.htm', ['copy-reload']);
});

// User-tasks
gulp.task('dist', ['copy', 'sass', 'js']);
gulp.task('run', ['browser-sync-proxy', 'dist', 'watch']);
gulp.task('default', ['browser-sync-serve', 'dist', 'watch']);
