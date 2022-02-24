It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.
This project uses aws cdk java api to deploy the data mapper lite as an aws lambda function.

## Installation

1. Install [AWS CDK CLI](https://docs.aws.amazon.com/cdk/latest/guide/getting_started.html)
2. [`cdk boostrap --profile YOUR_AWS_PROFILE`](https://docs.aws.amazon.com/cdk/latest/guide/bootstrapping.html)
3. Run ./buildAndDeploy.sh
4. For the deployed Lambda function: EFS file system, Access Point and Local mount path needs to be [`configured`](https://aws.amazon.com/blogs/compute/using-amazon-efs-for-aws-lambda-in-your-serverless-applications/).
5. The Local mount path needs to be /mnt/efs

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation
 