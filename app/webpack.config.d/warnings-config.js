config.performance = {
    ...config.performance,
    hints: false,
};

config.ignoreWarnings = [
    ...(config.ignoreWarnings || []),
    /Critical dependency: the request of a dependency is an expression/,
];
